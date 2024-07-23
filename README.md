<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>
    <h1>Bio Tools App</h1>
    <p>Welcome to the Bio Tools Android Application, your comprehensive suite for bioinformatics tools. This application including Transcription, Translation, Palindrome detection, Open Reading
    Frame identification, GC Content calculation, Splicing, Global Alignment, Local Alignment, and Dot Plot matrix visualization offers a range of functionalities designed and
    accessible for those working in the field of bioinformatics. Dive into each tool to explore and analyze genetic sequences in innovative and interactive ways.</p>

<h2>Table of Contents</h2>
<ul>
    <li><a href="#main-screen">Main Screen</a></li>
    <li><a href="#transcription-screen">Transcription Screen</a></li>
    <li><a href="#translation-screen">Translation Screen</a></li>
    <li><a href="#splicing-screen">Splicing Screen</a></li>
    <li><a href="#global-alignment-screen">Global Alignment Screen</a></li>
    <li><a href="#local-alignment-screen">Local Alignment Screen</a></li>
    <li><a href="#dot-plot-screen">Dot Plot Screen</a></li>
    <li><a href="#open-reading-frame-screen">Open Reading Frame Screen</a></li>
    <li><a href="#gc-content-screen">GC Content Screen</a></li>
    <li><a href="#palindrome-screen">Palindrome Screen</a></li>
</ul>

<h2 id="main-screen">Main Screen</h2>
<p>The Main Screen serves as the central hub of the Bio Tools App. Here, you will find buttons navigation to each specific bioinformatics tool. Each button is intuitively labeled, ensuring that you can quickly access the tool you need.</p>

<h2 id="transcription-screen">Transcription Screen</h2>
<p>The Transcription Screen is designed to convert a DNA sequence into its corresponding RNA sequence. Enter your DNA sequence into the <code>EditText</code> field, and with a tap of the "Transcribe" button,  thymine (T) is replaced by uracil (U), transforming your DNA into RNA. The resulting RNA sequence is displayed in a visually appealing <code>TextView</code>.</p>

<h2 id="translation-screen">Translation Screen</h2>
<p>The Translation Screen convert nucleotides to amino acids. Input your DNA sequence into the <code>EditText</code> field, and press the "Translate" button. The app uses the standard genetic code to convert the DNA sequence into a protein sequence,
    which is then presented the result in <code>TextView</code>. </p>

<h2 id="splicing-screen">Splicing Screen</h2>
<p>The Splicing Screen simulates the biological process of RNA splicing. Enter a DNA sequence that includes introns, and the app will remove these introns and splice together the exons to form the mature mRNA sequence. </p>

<h2 id="global-alignment-screen">Global Alignment Screen</h2>
<p>The Global Alignment Screen employs the Needleman-Wunsch algorithm to align two DNA sequences globally. Users can input two DNA sequences, along with the score of match mismatch and gap the app will display the aligned sequences along with a 
    scoring matrix. This screen is particularly useful for comparing entire sequences, providing insights into sequence similarities and differences.</p>

<h2 id="local-alignment-screen">Local Alignment Screen</h2>
<p>The Local Alignment Screen utilizes the Smith-Waterman algorithm to find the most similar regions between two DNA sequences. By inputting two sequences, users can identify highly similar subsequences. </p>

<h2 id="dot-plot-screen">Dot Plot Screen</h2>
<p>The Dot Plot Screen generates a dot plot matrix for visual comparison of two DNA sequences. Users input the sequences, and the app produces a dot plot, revealing regions of similarity through a matrix of dots.
    This graphical representation is valuable for quickly identifying homologous regions.</p>

<h2 id="open-reading-frame-screen">Open Reading Frame Screen</h2>
<p>The Open Reading Frame (ORF) Screen is essential for gene prediction. Enter a DNA sequence, and the app will identify and display all possible ORFs, highlighting the start and stop codons. 
    This screen is designed to help researchers locate potential genes within a genomic sequence.</p>

<h2 id="gc-content-screen">GC Content Screen</h2>
<p>The GC Content Screen calculates the percentage of guanine (G) and cytosine (C) in a given DNA sequence. Users can input their sequence, and the app will provide a detailed breakdown of the GC content, 
    This tool is useful for analyzing genome stability and gene density.</p>

<h2 id="palindrome-screen">Palindrome Screen</h2>
<p>The Palindrome Screen detects palindromic sequences within a DNA strand. These sequences read the same backward as forward. Input a DNA sequence, and the app highlights the palindromic regions,
    making it easy to identify symmetrical patterns. This tool is particularly useful for studying restriction enzyme recognition sites and genomic motifs.</p>
</body>
</html>
